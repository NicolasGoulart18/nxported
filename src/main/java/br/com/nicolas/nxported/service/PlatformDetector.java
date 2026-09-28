package br.com.nicolas.nxported.service;

import br.com.nicolas.nxported.model.Platform;

public class PlatformDetector {
    public Platform detect(String url) {
        if (url == null || url.isBlank()) {
            throw new IllegalArgumentException("URL cannot be empty");
        }

        if (url.contains("instagram.com")) {
            return Platform.INSTAGRAM;
        }

        if (url.contains("tiktok.com")) {
            return Platform.TIKTOK;
        }

        throw new IllegalArgumentException("Unsupported platform");
    }
}
