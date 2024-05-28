public class LowPriorityConrete implements RequestProduct {

    @Override
    public void setPriority(Request request) {
        request.setPriority("Ignore");
    }

    @Override
    public void setExpire(Request request) {
        request.setExpireDay("28/5/2024");
    }

    @Override
    public void setStatus(Request request) {
        request.setStatus("Done");
    }

    @Override
    public Request processRequest(Request request) {
        System.out.println("Request denied");
        setPriority(request);
        setExpire(request);
        setStatus(request);
        return request;
    }

}
