import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import re.itsjava.domain.MusicLp;

import java.util.ArrayList;
import java.util.List;


public class StoreTest {
    public static final String DEFAULT_TITLE = "Raining_blood";
    public static final String DEFAULT_AUTHOR = "Slayer";

    List<MusicLp> musicLpFromStore = new ArrayList<>();
    @DisplayName("Выполняется ли метод putMusicLp")
@Test
    public void checkPutMusicLp(){
    MusicLp expectedMusicLp = new MusicLp(DEFAULT_TITLE,DEFAULT_AUTHOR);
    musicLpFromStore.add(expectedMusicLp);
    Assertions.assertEquals(expectedMusicLp,musicLpFromStore.get(0));


}
    @DisplayName("Выполняется ли метод hasMusicLp ")
    @Test
    public void checkHasMusicLp(){
        MusicLp expectedMusicLp = new MusicLp(DEFAULT_TITLE,DEFAULT_AUTHOR);
        musicLpFromStore.add(expectedMusicLp);
        Assertions.assertTrue(musicLpFromStore.contains(expectedMusicLp));


    }




}
