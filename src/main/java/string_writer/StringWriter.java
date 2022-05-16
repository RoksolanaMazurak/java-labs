package string_writer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class StringWriter {
    private int strSize;
    private String question;
    public String writeString(StringWriter stringWriter) throws IllegalArgumentException {

        if(getStrSize() < 0) {
            throw new IllegalArgumentException("String size cannot contain '-'.");
        }

        System.out.println("Expected number of characters: " + getStrSize());

        String real_len = getQuestion().replaceAll("\\s+", "");
        int realStrLen = real_len.length();
        System.out.println("Real number of characters in question: " + realStrLen);

        if (realStrLen <= getStrSize()) {
            System.out.println(getQuestion() + "?");
        } else {
            String temp = new StringBuilder(getQuestion()).toString();
            List<String> str = Arrays.asList(temp.split(" "));
            Collections.reverse(str);
            System.out.println(str);
        }
        return getQuestion();
    }
}
