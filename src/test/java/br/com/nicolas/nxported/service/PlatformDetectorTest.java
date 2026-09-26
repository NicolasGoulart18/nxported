package br.com.nicolas.nxported.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import br.com.nicolas.nxported.model.Platform;
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
    void shouldDetectTiktokUrl(){
        PlatformDetector detector = new PlatformDetector();
        Platform result = detector.detect(
            "https://www.tiktok.com/@usuario/video/123"
        );
        assertEquals(Platform.TIKTOK, result);
    }
    

}