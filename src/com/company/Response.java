/**
 * Класc для отсылки результатов работы юзеру
 *
 * @version 0.1
 * @package standard
 * @author Igor Budasov <igor.budasov@gmail.com>
 * @copyright Copyright (c) 2013, Igor Budasov
 */

package com.company;

public class Response {

    private String result;

    /**
     * Конструктор объекта ответа
     */
    Response() {

    }

    /**
     * Метод возвращает текущее содержимое объекта запроса
     *
     * @return String
     */
    public String get() {
        return this.result;
    }

    /**
     * Метод устанавливает содержимое ответа.
     * Например, когда мы обработали какие-то данные --
     * мы можем установить их в качестве ответа и отдать юзеру
     * с помощью Response.send();
     *
     * @param result String
     * @return String
     */
    public String set(String result) {
        return this.result = result;
    }

    /**
     * Метод отправляет пользователю ответ программы
     */
    public void send() {
        System.out.println(this.result);
        return;
    }
}
