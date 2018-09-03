package com.spring.factory;

import com.dp.abstrac.MagicFactory;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassPathXmlApplicationContext implements BeanFactory{
    private Map<String, Object> map = new HashMap<>();

    public ClassPathXmlApplicationContext(String fileName) throws Exception{
        SAXBuilder sb=new SAXBuilder();
        Document doc=sb.build(this.getClass()
                .getClassLoader()
                .getResourceAsStream(fileName));
        Element root=doc.getRootElement();
        List list=root.getChildren("bean");
        for(int i=0;i<list.size();i++){
            Element bean=(Element)list.get(i);
            String id=bean.getAttributeValue("id");
            String clazz=bean.getAttributeValue("class");
            Object object = Class.forName(clazz).newInstance();
            map.put(id, object);
        }
    }

    @Override
    public Object getBean(String id) {

        return map.get(id);
    }
}
