public class Main {
    public static void main(String[] args) {
        // консруктор вариант1
        GuideWorker guideWorker = new GuideWorker();

        // Добавление сотрудников по данным
        guideWorker.add(101, "8999", "Петров Вася", 10);
        guideWorker.add(102, "8777", "Сидоров Вася", 1);
        guideWorker.add(103, "8555", "Иванов Иван", 3);
        guideWorker.add(104, "8123", "Коновалова Анна", 10);
        guideWorker.add(105, "8321", "Серегин Сергей", 28);

        // добавление сотрудника с дубликатом idnumber
        guideWorker.add(105, "8333", "Пупкин Сергей", 28);

        // печатаем созданный справочник
        System.out.println(guideWorker);

        // Ищем сотрудников по стажу 10 и добавляем их список в новый справочник проверяем конструктор 2
        GuideWorker guideWorker2 = new GuideWorker(guideWorker.findWorkerByExperience(10));

        // поиск сотрудника по табельному номеру
        //ищем сотрудников по idNumber добавляем сотрудника как объект в справочник2 печатаем второй справочник
        guideWorker2.add(guideWorker.findWorkerByIdNumber(105));
        System.out.println(guideWorker2);

        // поиск номера телефона по имени (добавил в результат полное имя, чтобы было понятно чьи телефоны найдены)
        System.out.println(guideWorker.findPhoneNumberByname("Вася"));

    }

}