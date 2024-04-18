package re.itsjava.services;


import re.itsjava.domain.MusicLp;

public interface MusicLpService {
    MusicLp takeMusicLpByName(String name);
    void putMusicLp (MusicLp musicLp);
    boolean hasMusicLp(String name);
    void printMusicLp();


}
