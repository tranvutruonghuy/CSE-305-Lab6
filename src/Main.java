public class Main {
    public static void main(String[] args) {
        Request lowRequest = new LowPriorityConcreteCreator().createRequest();
        Request midRequest = new MidPriorityConcreteCreator().createRequest();
        Request highRequest = new HighPriorityConcreteCreator().createRequest();
    }
}
