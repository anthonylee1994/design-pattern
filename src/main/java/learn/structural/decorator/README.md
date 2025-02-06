# 裝飾者模式 (Decorator Pattern)

## 概述

裝飾者模式是一種結構型設計模式，它允許我們動態地將新的行為附加到對象上。裝飾者模式提供了子類別的替代方案，可以靈活地擴展對象的功能。

## 主要優點

- 不需要建立新的子類別就能擴展對象的行為
- 可以動態地增加或刪除對象的職責
- 有效地避免了「類別爆炸」的問題
- 符合「開放封閉原則」，對擴展開放，對修改封閉

## 咖啡店範例說明

### 基本結構

1. `Coffee` (介面)

   - 定義了所有咖啡都必須實現的基本方法
   - `getCost()`: 獲取價格
   - `getDescription()`: 獲取描述

2. `SimpleCoffee` (具體組件)

   - 實現了 `Coffee` 介面
   - 代表最基本的咖啡，價格為 10 元
   - 描述為「一杯咖啡」

3. `CoffeeDecorator` (抽象裝飾者)
   - 實現 `Coffee` 介面
   - 持有一個 `Coffee` 類型的引用
   - 作為所有具體裝飾者的基類

### 具體裝飾者

1. `MilkCoffee` (牛奶咖啡)

   - 增加 2 元費用
   - 描述添加「加奶」

2. `WhipCoffee` (鮮奶油咖啡)

   - 增加 3 元費用
   - 描述添加「加鮮奶油」

3. `VanillaCoffee` (香草咖啡)
   - 增加 3 元費用
   - 描述添加「加香草」

## 使用範例

```java
Coffee someCoffee = new SimpleCoffee();
System.out.println(someCoffee.getCost());       // 10
System.out.println(someCoffee.getDescription()); // 一杯咖啡

someCoffee = new MilkCoffee(someCoffee);
System.out.println(someCoffee.getCost());       // 12
System.out.println(someCoffee.getDescription()); // 一杯咖啡，加奶

someCoffee = new WhipCoffee(someCoffee);
System.out.println(someCoffee.getCost());       // 15
System.out.println(someCoffee.getDescription()); // 一杯咖啡，加奶，加鮮奶油

someCoffee = new VanillaCoffee(someCoffee);
System.out.println(someCoffee.getCost());       // 18
System.out.println(someCoffee.getDescription()); // 一杯咖啡，加奶，加鮮奶油，加香草
```

## 應用場景

1. 需要動態地給對象添加功能，而且這些功能可以動態地撤銷
2. 需要在不影響其他對象的情況下，以動態、透明的方式給單個對象添加職責
3. 當不能採用繼承的方式對系統進行擴充或者採用繼承不利於系統擴展和維護時

## 注意事項

1. 裝飾類和被裝飾類必須是同一類型，也就是要有共同的超類
2. 儘量保持裝飾類的接口與被裝飾類的接口相同，這樣可以使得裝飾模式更加透明
3. 裝飾者模式可能會導致系統中出現很多小類，增加系統的複雜度
4. 裝飾者模式比繼承更加靈活，但同時也更難理解和調試
