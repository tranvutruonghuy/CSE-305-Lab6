public class LowPriorityConcreteCreator implements RequestCreator {

    @Override
    public Request createRequest() {
        Request request = new Request();
        LowPriorityConrete build = new LowPriorityConrete();
        build.processRequest(request);
        return request;
    }

}
