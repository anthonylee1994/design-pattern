這是一個使用 Visitor Pattern (訪問者模式) 的 Java 範例，主要用於對不同動物類型執行不同操作。結構說明：

1. **核心組成**：

- 🐒 動物介面 `Animal` 定義了 `accept()` 方法
- 👨💻 訪問者介面 `AnimalVisitor` 包含各動物類型的 visit 方法
- 具體動物類：`Monkey`/`Lion`/`Dolphin` 各自實現特有行為

2. **運作流程**：

```java:src/main/java/learn/Main.java
animal.accept(new SpeakVisitor()); // 觸發對應動物的訪問邏輯
animal.accept(new JumpVisitor());
```

3. **設計模式特點**：

- 雙重分派 (Double Dispatch)：透過 accept() + visit() 的組合實現
- 符合開放封閉原則：新增操作只需加 Visitor，不需改動物類
- 行為集中化：將散落在各動物類的行為邏輯集中到 Visitor 中

4. **範例行為**：

- `SpeakVisitor` 處理動物叫聲
- `JumpVisitor` 處理跳躍行為
- 輸出結果會顯示中文的動物名稱和對應行為

這個架構方便擴展新操作(如新增 SwimVisitor)，但新增動物類型時需要修改所有現有 Visitor，這是訪問者模式的典型 trade-off。
