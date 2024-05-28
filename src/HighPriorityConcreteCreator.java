public class HighPriorityConcreteCreator implements RequestCreator {

    @Override
    public Request createRequest() {
        Request request = new Request();
        HighPriorityConcrete build = new HighPriorityConcrete();
        build.processRequest(request);
        return request;
    }

}