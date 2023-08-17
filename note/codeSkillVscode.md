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
