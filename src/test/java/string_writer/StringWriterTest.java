package string_writer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringWriterTest {

    @Test
    public void StringIfSizeEqualsNumOfChars() {
         StringWriter stringWriter = new StringWriter(9,"How are you");
         var actual = stringWriter.writeString(stringWriter);
         Assertions.assertEquals(stringWriter.getQuestion(), actual);
    }

    @Test
    public void expStringIfSizeGreaterThanNumOfChars() {
        StringWriter stringWriter = new StringWriter(12,"How are you");
        var actual = stringWriter.writeString(stringWriter);
        Assertions.assertEquals(stringWriter.getQuestion(), actual);
    }

    @Test
    public void numOfCharsGreaterExpStringSize() {
        StringWriter stringWriter = new StringWriter(5,"How are you");
        var actual = stringWriter.writeString(stringWriter);
        Assertions.assertEquals(stringWriter.getQuestion(), actual);
    }

    @Test
    public void nullStrSize() {
        StringWriter stringWriter = new StringWriter(0,"How are you");
        var result = stringWriter.writeString(stringWriter);
    }

    @Test
    public void nullStr() {
        StringWriter stringWriter = new StringWriter(5,"");
        var result = stringWriter.writeString(stringWriter);
    }

    @Test
    public void nullSizeAndStr() {
        StringWriter stringWriter = new StringWriter(0,"");
        var result = stringWriter.writeString(stringWriter);
    }

    @Test
    public void minusStrSize() {
        StringWriter stringWriter = new StringWriter(-1,"How are you");
        var result = stringWriter.writeString(stringWriter);
    }
}