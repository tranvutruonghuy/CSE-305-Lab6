public interface RequestProduct {
    public void setPriority(Request request);

    public void setExpire(Request request);

    public void setStatus(Request request);

    public Request processRequest(Request request);
}
