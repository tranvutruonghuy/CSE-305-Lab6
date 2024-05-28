public class MidPriorityConcreteCreator implements RequestCreator {

    @Override
    public Request createRequest() {
        Request request = new Request();
        MidPriorityConcrete build = new MidPriorityConcrete();
        build.processRequest(request);
        return request;
    }

}