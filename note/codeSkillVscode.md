# Vscode中的java运行技巧

### 创建模板(template)

步骤：

管理-----> 用户代码块片段-----> java.json(对应语言的json文件) -----> 写模板

```
	"Main function": {
		"prefix": "main",
		"body": [
			"public static void main(String[] args){",
			"\t$0",
			"}"
		],
		"description": "main function"
```

prefix为提示词(打出此词回车即可打印整个模板)；

body为模板，$1、$2为光标的依次出现位置，$0为最终出现位置，按Tab键进行跳跃

### 快捷创建类的修饰器

步骤：

选中所定义的变量右键，点击源代码操作，选择Generote Constructor

### 快捷创建类中变量的set与get方法

步骤：

选中所定义的变量右键，点击源代码操作，选择Generote Getters and Setters


# 命名规范

在Java中，命名方法（命名约定）是一种约定俗成的标准，用于定义变量、方法、类等的名称。良好的命名方法可以使你的代码更加清晰易读，有助于代码的维护和理解。以下是一些常见的Java命名方法：

1. **变量和字段：**

   - 使用有意义的名称，描述变量的用途。例如：`count`, `userName`, `totalAmount`。
   - 遵循驼峰命名法（camelCase），即首个单词小写，后续单词首字母大写。例如：`studentName`, `itemPrice`.
2. **方法：**

   - 使用动词或动词短语描述方法的操作。例如：`calculateTotal`, `printReport`, `getUserInfo`.
   - 同样遵循驼峰命名法。例如：`getUserName`, `calculateDiscount`.
3. **类和接口：**

   - 使用名词或名词短语描述类的实体。例如：`Student`, `Car`, `Employee`.
   - 遵循驼峰命名法，首字母大写。例如：`StudentInfo`, `CarModel`.
4. **常量：**

   - 使用全大写字母，多个单词之间用下划线分隔，表示常量。例如：`MAX_VALUE`, `PI`, `DEFAULT_TIMEOUT`.
5. **包：**

   - 使用小写字母，多个单词之间用点分隔，表示包名。例如：`com.example.project`, `org.company.app`.
6. **布尔变量：**

   - 常常以 `is`、`has`、`can` 等开头，表示布尔值的含义。例如：`isAvailable`, `hasPermission`.
7. **方法参数：**

   - 使用有意义的名称，描述参数的作用。例如：`calculateTotal(int quantity, double price)`。
8. **避免缩写：**

   - 尽量避免使用不明确的缩写，以提高代码的可读性。
9. **明确和一致的命名：**

   - 使用一致的命名风格，避免使用类似的名称，以免造成混淆。
10. **避免使用关键字：**

    - 不要使用Java的保留关键字作为标识符，如 `int`, `class`, `if` 等。

好的命名方法可以让你的代码更易于理解和维护，所以在命名时要尽量清晰和一致。
