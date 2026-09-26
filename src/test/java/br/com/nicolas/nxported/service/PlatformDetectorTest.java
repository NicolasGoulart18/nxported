package br.com.nicolas.nxported.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import br.com.nicolas.nxported.model.Platform;
import static org.junit.jupiter.api.Assertions.assertThrows;
class PlatformDetectorTest{

    @Test 
    void shouldDetectInstagramUrl(){
        PlatformDetector detector = new PlatformDetector();
        Platform result = detector.detect(
            "https://www.instagram.com/reel/abc123"
        );
        assertEquals(Platform.INSTAGRAM,result);
    }

    @Test 
    void shouldDetectTikTokUrl(){
        PlatformDetector detector = new PlatformDetector();
        Platform result = detector.detect(
            "https://www.tiktok.com/@usuario/video/123"
        );
        assertEquals(Platform.TIKTOK, result);
    }

    @Test
    void shouldRejectUnsupportedPlatform() {
    PlatformDetector detector = new PlatformDetector();

    assertThrows(
            IllegalArgumentException.class,
            () -> detector.detect("https://www.youtube.com/watch?v=123")
    );
}
    

}