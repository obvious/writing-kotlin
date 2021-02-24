package in.obvious.ws.writingkotlin.dataclasses.java;

public class NetworkRequest {

    final String url;

    final Method method;

    final String body;

    final long timeout;

    public NetworkRequest(String url, Method method, String body, long timeout) {
        this.url = url;
        this.method = method;
        this.body = body;
        this.timeout = timeout;
    }

    public NetworkRequest(String url) {
        this(url, Method.GET, null, 30_000);
    }

    public NetworkRequest(String url, long timeout) {
        this(url, Method.GET, null, timeout);
    }

    public NetworkRequest.Builder newRequest() {
        return new Builder(this);
    }

    public static class Builder {
        private String url;

        private Method method;

        private String body;

        private long timeout;

        public Builder(String url) {
            this.url = url;
            this.method = Method.GET;
            this.body = null;
            this.timeout = 30_000;
        }

        public Builder(NetworkRequest request) {
            this.url = request.url;
            this.method = request.method;
            this.body = request.body;
            this.timeout = request.timeout;
        }

        public Builder method(Method method) {
            this.method = method;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder timeout(long timeout) {
            this.timeout = timeout;
            return this;
        }

        public NetworkRequest build() {
            return new NetworkRequest(url, method, body, timeout);
        }
    }

    /*    public NetworkRequest.Builder newRequest() {
        return new Builder(this);
    }

    public static class Builder {
        private String url;

        private Method method;

        private String body;

        private long timeout;

        public Builder(String url) {
            this.url = url;
            this.method = Method.GET;
            this.body = null;
            this.timeout = 30_000;
        }

        public Builder(NetworkRequest request) {
            this.url = request.url;
            this.method = request.method;
            this.body = request.body;
            this.timeout = request.timeout;
        }

        public Builder method(Method method) {
            this.method = method;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder timeout(long timeout) {
            this.timeout = timeout;
            return this;
        }

        public NetworkRequest build() {
            return new NetworkRequest(url, method, body, timeout);
        }
    }*/
}
