package re.itsjava.services;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Scanner;
@Data
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{
    private final  ClientServiceImpl clientService;
    private final Scanner scanner;

    public void menu(){
        while (true) {
            System.out.println("Введите номер меню");
            int menuNum = scanner.nextInt();
            if (menuNum == 1) {
                System.out.println("Вы выбрали купить пластинку");
                clientService.buyMusicLp();
            } else if (menuNum == 2) {
                System.out.println("Положить пластинку");
                clientService.putMusicLp();

            } else if (menuNum == 3) {
                System.out.println("Печатаем название пластинок...");
                clientService.printMusicLp();
            } else {
                System.out.println("До встречи");
                break;
            }
        }

    }
    @Override
    public void printMenu(){
        System.out.println("1.купить; 2.Отдать; Все остальное выход");
    }
}
