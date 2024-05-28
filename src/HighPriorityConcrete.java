public class HighPriorityConcrete implements RequestProduct {
    @Override
    public void setPriority(Request request) {
        request.setPriority("Emergency");
    }

    @Override
    public void setExpire(Request request) {
        request.setExpireDay("28/5/2024");
    }

    @Override
    public void setStatus(Request request) {
        request.setStatus("Accept");
    }

    @Override
    public Request processRequest(Request request) {
        setPriority(request);
        setExpire(request);
        setStatus(request);
        System.out.println("Emergency request, our Administer will contact you immediately!");
        return request;
    }
}
