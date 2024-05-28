public class MidPriorityConcrete implements RequestProduct {

    @Override
    public void setPriority(Request request) {
        request.setPriority("Medium");
    }

    @Override
    public void setExpire(Request request) {
        request.setExpireDay("28/6/2024");
    }

    @Override
    public void setStatus(Request request) {
        request.setStatus("Accepted");
    }

    @Override
    public Request processRequest(Request request) {
        setPriority(request);
        setExpire(request);
        setStatus(request);
        System.out.println("Request accept, estimated completion date is " + request.getExpireDay());
        return request;
    }
}
