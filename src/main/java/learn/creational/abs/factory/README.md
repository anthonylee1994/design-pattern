# 抽象工廠模式 (Abstract Factory Pattern)

## 概述

抽象工廠模式是一種創建型設計模式，它提供了一個介面來創建一系列相關或相互依賴的物件，而無需指定其具體類別。

## 實現說明

在這個範例中，我們實現了一個門的製造系統，包含以下幾個主要部分：

### 核心組件

1. **門的種類** (`Door` 介面)

   - `WoodenDoor`：木門實現
   - `IronDoor`：鐵門實現

2. **安裝專家** (`DoorFittingExpert` 介面)

   - `Carpenter`：木匠，專門安裝木門
   - `Welder`：焊工，專門安裝鐵門

3. **工廠** (`DoorFactory` 介面)
   - `WoodenDoorFactory`：生產木門和對應的木匠
   - `IronDoorFactory`：生產鐵門和對應的焊工

### 類別關係

- 每個工廠都實現了 `DoorFactory` 介面
- 每個工廠負責創建特定類型的門和對應的安裝專家
- 工廠確保了產品（門和專家）之間的相容性

## 使用範例

```java
// 創建木門工廠
DoorFactory woodenFactory = new WoodenDoorFactory();
Door woodenDoor = woodenFactory.makeDoor();
DoorFittingExpert carpenter = woodenFactory.makeFittingExpert();

// 創建鐵門工廠
DoorFactory ironFactory = new IronDoorFactory();
Door ironDoor = ironFactory.makeDoor();
DoorFittingExpert welder = ironFactory.makeFittingExpert();
```

## 優點

1. 確保產品之間的相容性
2. 避免直接與具體產品耦合
3. 遵循單一職責原則和開閉原則
4. 便於產品系列的切換

## 使用場景

- 當系統需要獨立於產品的創建、組合和表示時
- 當系統需要配置多個產品系列時
- 當相關產品物件需要一起使用時
- 當您想要提供一個產品類別庫，只想顯示它們的介面而不是實現時
