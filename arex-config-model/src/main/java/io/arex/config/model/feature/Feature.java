package io.arex.config.model.feature;

/**
 * @author jmo
 * @since 2022/1/21
 */
public interface Feature {
    String name();

    boolean enabledIn(int flags);

    int getMask();
}