package io.flaterlab.comments.models;

public class Api {
    String version = "1";

    public Api(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
