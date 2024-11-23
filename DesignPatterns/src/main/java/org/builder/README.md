## Builder Design Pattern

### Basic Builder

- Implemented in **org.builder.simplebuilder** package.
- It's the easiest way to make a builder, very powerful at **_customization_**.
- For this builder, the **mandatory fields** are just a convention. The object can be created even if none of
the required fields were set.

### Mandatory Fields Builder

- Implemented in **org.builder.mandatoryfieldsbuilder** package.
- It's a little improvement of the previous builder, the simplest one.
- This type of builder adds parameters to the **constructor**, making the fields really
**mandatory**.
- There remains a problem.
  We used the builder in the first place to get rid of the constructor,
which was annoying when the number of parameters had become too big.
  It works fine for one to, let's say, four mandatory fields, but what if we have more than that ?