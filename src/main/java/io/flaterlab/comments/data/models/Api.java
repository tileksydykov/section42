package io.flaterlab.comments.data.models;

public class Api {
    String name = "Section42";
    String version;
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
