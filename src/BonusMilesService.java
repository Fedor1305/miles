public class BonusMilesService {     //Создайте класс BonusMilesService (File -> New -> Java Class, вводите название и нажимаете Enter)

    public int calculate(int cost) { //Определите в нём метод calculate, который:
                                    // Принимает на вход один параметр: cost типа int
        int miles = cost / 20;      //  Анализируя значение переданного параметра, возвращает рассчитанное количество миль (тип - int)
        return miles;
    }


}


