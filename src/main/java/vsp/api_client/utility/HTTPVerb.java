package vsp.api_client.utility;

import org.jetbrains.annotations.NotNull;

/**
 * Offers all possible HTTP-Verbs for this application.
 */
public enum HTTPVerb {
    GET("GET"), POST("POST");

    @NotNull
    private String value;

    HTTPVerb(@NotNull final String value) {
        this.value = value;
    }

    @NotNull
    public String getValue() {
        return value;
    }
}
