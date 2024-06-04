# Experiment8

## 2 Facades:

### CodeGenerator Facade

The Class CodeGenerator has been used in Parser.java. But Parser only used 2 functions of this big class. So we've created a facade for this parser.

This Facade contains only printMemory and semanticFunction methods.

![img.png](screenshots/Facade1.png)

### Memory Facade

The class Memory has too many methods. But in class SymbolTable, the only method that has been used is memory.getDateAddress(). So we will create a facade for class SymbolTable using this method.

This Facade contains only getDateAddress methods.

![img.png](screenshots/Facade2.png)

## Strategy

### Use this pattern in TypeAddress

Instead of using if/else in Address.java toString method, we consider TypeAddress as an Strategy to be set and return good toString output itself.

We should consider changing all enum uses in CodeGenerator and replace them with correct object.

![img.png](screenshots/Imidiate.png)
![img.png](screenshots/Indirect.png)
![img.png](screenshots/Direct.png)


## Seperate Query From Modifier

In Class Memory.java there are two methods that violate this pattern.

![img.png](screenshots/Sep1.png)

We Should Seperate modification of variables fromo getters in these two methods. In the picture below we fixed this issue.

![img.png](screenshots/Sep2.png)
