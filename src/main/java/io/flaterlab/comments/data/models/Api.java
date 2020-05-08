package io.flaterlab.comments.models;

public class Api {
    String name = "Section42";
    String version = "0.1";
    String info = "This is base for section42";

    public Api(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }
}
