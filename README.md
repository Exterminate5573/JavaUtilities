# JavaUtilities

Some helpful utilities for people coding in java.

## Usage
```java
import me.exterminate.utils.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(IsIntegerUtil.isInteger(6969)); //Returns true
        BetterBoolean bool = new BetterBoolean(BetterBoolean.BooleanValue.TRUE);
        System.out.println(bool.getValue());
    }
}
```  
