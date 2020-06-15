package james.gustavo.exemplolombok.model;

import lombok.*;

/**
 * @author Gustavo James
 * @version 1.0
 * @since 14/06/2020
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {
    @Getter @Setter
    private String  name;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private int age;

    /**
     * @return Return the person age in months.
     */
    public  int calculateAgeInMonths() {
        return this.age * 12;
    }

}
