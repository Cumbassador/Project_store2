package re.itsjava.services;




import re.itsjava.domain.Client;
import re.itsjava.domain.MusicLp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StoreServiceImpl implements StoreService{
    @Override
    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String clientName =scanner.next();
        Client client = new Client(clientName,new ArrayList<>());
        List<MusicLp> musicLpList = new ArrayList<>();
        musicLpList.add( new MusicLp ("Definitely_Maybe"," Oasis"));
        musicLpList.add(new MusicLp("London_Calling"," Clash"));
        MusicLpService musicLpService = new MusicLpServiceImpl(musicLpList);

        ClientService clientService = new ClientServiceImpl(client,scanner,musicLpService);
        MenuService menuService = new MenuServiceImpl((ClientServiceImpl) clientService,scanner);
        menuService.menu();





    }
}
