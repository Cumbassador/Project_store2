package re.itsjava.services;

import lombok.AllArgsConstructor;

import re.itsjava.domain.Client;
import re.itsjava.domain.MusicLp;

import java.util.Scanner;

@AllArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final Client client;
    private final Scanner scanner;
    private MusicLpService musicLpService;
    @Override
    public void buyMusicLp(){
        System.out.println("Введите название книги");
        String title = scanner.next();
        if (musicLpService.hasMusicLp(title)){
            System.out.println("Покупаем книгу");
            musicLpService.takeMusicLpByName(title);
            System.out.println("Купили книгу" + title);

        }
        else {
            System.out.println("Не смогли купить книгу\n(такой книги нету)");
        }

    }
    @Override
    public void putMusicLp(){
        System.out.println("Введите название пластинки");
        String title = scanner.next();
        System.out.println("Введите исполнителя");
        String author = scanner.next();
        MusicLp musicLp = new MusicLp(title,author);
        musicLpService.putMusicLp(musicLp);

    }
    @Override
    public void printMusicLp(){
        System.out.println("Уважаемый "+ client.getName());
        System.out.println("Вот наши пластинки..." );
        musicLpService.printMusicLp();
    }

}
