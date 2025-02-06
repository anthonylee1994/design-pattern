# 橋接模式 (Bridge Pattern)

## 概述

橋接模式是一種結構型設計模式，它可以將抽象部分與實現部分分離，使它們都可以獨立地變化。這種模式通過組合而非繼承來實現功能的擴展。

## 實現說明

在這個示例中，我們實現了一個網頁主題系統，展示了橋接模式的應用：

### 主題實現 (Theme Implementation)

- `Theme` - 定義主題的介面
- `DarkTheme` - 實現深色主題
- `LightTheme` - 實現淺色主題

### 網頁抽象 (Webpage Abstraction)

- `WebPage` - 抽象網頁類別
- `About` - 關於頁面實現
- `Careers` - 職涯頁面實現

## 類別結構

```
Theme (介面)
├── DarkTheme
└── LightTheme

WebPage (抽象類別)
├── About
└── Careers
```

## 使用範例

```java
Theme darkTheme = new DarkTheme();
Theme lightTheme = new LightTheme();

WebPage about = new About(darkTheme);
WebPage careers = new Careers(lightTheme);

System.out.println(about.getContent());    // 輸出：About page in Dark Black
System.out.println(careers.getContent());  // 輸出：Careers page in Off White
```

## 優點

1. 將實現與抽象分離，降低耦合度
2. 提高系統的可擴展性
3. 實現細節對客戶端透明

## 使用場景

- 需要在多個維度上擴展系統時
- 需要在運行時切換不同實現時
- 當一個類別的多個屬性有多種可能時
