package re.itsjava.services;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import re.itsjava.domain.MusicLp;

import java.util.List;
@Data
@RequiredArgsConstructor
public class MusicLpServiceImpl implements MusicLpService {
    private final List<MusicLp> musicLpFromStore;

    @Override
    public MusicLp takeMusicLpByName(String name) {
        MusicLp resmusicLp = null;
        for (MusicLp musicLp : musicLpFromStore) {
            if (musicLp.getTitle().equals(name)) {
                resmusicLp = musicLp;
            }
        }
        if (resmusicLp != null) {
            musicLpFromStore.remove(resmusicLp);
            return resmusicLp;
        }
        return null;
    }

    @Override
    public void putMusicLp(MusicLp musicLp) {
        musicLpFromStore.add(musicLp);


    }

    @Override
    public boolean hasMusicLp(String name) {
        for (MusicLp musicLp : musicLpFromStore) {
            if (musicLp.getTitle().equals(name)) {
                return true;
            }

            return true;
        }

        return false;
    }

    @Override
    public void printMusicLp() {
        for (MusicLp musicLp: musicLpFromStore) {
            System.out.println((musicLp.getTitle() + " " + musicLp.getAuthor()));
        }

    }
}
