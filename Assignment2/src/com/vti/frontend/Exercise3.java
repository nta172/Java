package com.vti.frontend;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercise3 {
    public static void main(String[] args) {
        /*Question 1: In ra thông tin Exam thứ 1 và property create date
         * sẽ được formar định dạng theo việt nam
         */
        // Giả sử đây là class Exam
                class Exam {
                    int id;
                    String code;
                    Date createDate;

                    public Exam(int id, String code, Date createDate) {
                        this.id = id;
                        this.code = code;
                        this.createDate = createDate;
                    }
                }
        
                // Tạo đối tượng Exam
                Exam exam1 = new Exam(1, "EX123", new Date());
                Locale locale = new Locale("vn", "VN");
                DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
                String date = dateformat.format(exam1.createDate);
                System.out.println(exam1.code + ": " + date);
    }
}
