# 项目使用说明 #

## 项目部署 ##


	mvn package             // 项目打包成默认jar
	*/target/xx.jar         // jar包路径
	java -jar xx.jar        // 将jar放到服务机器上运行即可启动
	http://localhost:8080   // 服务默认访问地址

## 配置说明 ##

	配置文件：application.properties
	
	1、数据源切换
	datasource.choose           // 1:oracle  2:mysql
	pagehelper.helperDialect    //这里也需要切换下
	
	2、日志配置
	logging.level.com.service.dao.db1
	logging.level.com.service.dao.db2
	//注释掉表示不打印日志，可让控制台清晰
	//db1表示打印数据源是oracle的sql日志，db2表示打印数据源是mysql的sql日志
	//可以设置日志打印级别，info，debug，warn等
	
	3、服务器文件地址
	sword.uploadPath=
	//该配置表示读取资源所在的服务器路径，使用于资源查询时的资源下载操作
	

## 项目结构 ##

	java/com/service
	    controller  //前端接口调用入口
	    core        //服务配置，无实际应用代码，可忽略
	    dao         //与数据库进行交互的类集合
	    model       //数据库表字段的定义，作为出参字段定义
	    sysservice  //controller调用的接口与接口对应的实现类
	
	resource
	    mapper      //数据库操作语句
	        db1     //oracle操作语句
	        db2     //mysql操作语句

## 技术栈 ##

	springboot  2.1.1
	mybatis     1.3.2
	druid       1.0.29
	generator   1.3.5
	pagehelper  1.2.5
	
	
	
	

