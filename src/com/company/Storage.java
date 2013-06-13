/**
 * Класc для хранения данных о задачах
 *
 * @version 0.1
 * @package standard
 * @author Igor Budasov <igor.budasov@gmail.com>
 * @copyright Copyright (c) 2013, Igor Budasov
 */

package com.company;

public class Storage {

    /**
     * Двумерный массив с задачами.
     * Ключ записи - айдишник задачи.
     * Поля записи - времчя старта и финиша, имя задачи
     */
    public String[][] tasks;

    public Storage() {
        // конструктор
        this.tasks[1] = new String[]{"Название задачи", "2013-10-10 11:12:13", "2013-10-10 11:12:14"};
    }

    public String[] add() {
        // добавление таска в переменную tasks
        return new String[]{};
    }

    public String[] get(Integer id) {
        // вохвращает задачу по айдишнику из переменноцй tasks
        return new String[]{};
    }

    public String[] delete(Integer id) {
        // удаление таска по айдишнику из переменноцй tasks
        return new String[]{};
    }

    public String[] truncate(Integer id) {
        // удаление всех задач
        return new String[]{};
    }
}
