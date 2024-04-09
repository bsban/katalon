<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_(Chrome)   .                          _bd023c</name>
   <tag></tag>
   <elementGuidId>79d46df8-0cd7-4478-b182-e56c29200a82</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>body</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
      <webElementGuid>ae0d20a2-9a71-4c32-9fef-48f75fd4e7ba</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>


    
        
            
            
                
                    
                    입력 삭제
                
            
            
                
                    
                    입력 삭제
                
            
            
                
                    
                    아이디저장
                
            
            
            
            
            
            
            
            
            
            
                관리자 로그인
            
            
                *본 사이트는 크롬(Chrome) 브라우저에 최적화 되어있습니다.*
                크롬다운받기
            
        
    
    
        비밀번호 초기화
        아이디 찾기
    
    
        Copyright (C) ORP Institute. All Rights reserved.
    


  
    
      
        아이디 찾기
      
      
        
          아래 이메일 주소로 문의 부탁드립니다.
          webmaster@wiselection.com 
          이메일주소 복사
        
      
      닫기
    
  
  
    $(document).ready(function() {
      //이메일 복사
      $(&quot;.btn-copy&quot;).click(function(){
        window.navigator.clipboard.writeText($(&quot;#email-copy&quot;).text());
        alert(&quot;이메일주소가 복사되었습니다.&quot;);
      });
    });
  
  
  
    const WAP_COM_0015 = new LayerPopup({target: &quot;WAP-COM-0015&quot;});
    const WAP_COM_0015_pop = {
      &quot;WAP_COM_0015&quot; : ()=>{
        WAP_COM_0015.show()
      },
    }
    if(Util.getUrlParams().popup) WAP_COM_0015_pop[Util.getUrlParams().popup]();
  
  


    $(document).ready(function(){
        if((getCookie(&quot;userLoginId&quot;) !== &quot;&quot;)){
            $(&quot;input[name='userId']&quot;).val(getCookie(&quot;userLoginId&quot;));
            $(&quot;#checkId&quot;).prop(&quot;checked&quot;, true);
        }
        //아이디 저장
        $(&quot;#checkId&quot;).change(function(){
            if($(&quot;#checkId&quot;).is(&quot;:checked&quot;)){  //checked true
                const userLoginId = $(&quot;input[name='userId']&quot;).val();
                setCookie(&quot;userLoginId&quot;, userLoginId, 30); // 30일 동안 쿠키 보관
            }else{ //checked false
                deleteCookie(&quot;userLoginId&quot;);
            }
        });
    });


/html[1]/body[1]/div[@class=&quot;login-wrap&quot;]/form[@class=&quot;form-signin&quot;]/div[@class=&quot;login-wrap__box&quot;]/div[@class=&quot;form-inner&quot;]/div[@class=&quot;input-box&quot;]/input[@class=&quot;input-txt&quot;]</value>
      <webElementGuid>b8cab1d0-56e9-45e8-98bd-46f4412f1dfa</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]</value>
      <webElementGuid>e93ef5ca-cc3b-4428-a4b6-3e2d7a476ea7</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>648479cd-a195-4089-886d-41318f28c7f6</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot;


    
        
            
            
                
                    
                    입력 삭제
                
            
            
                
                    
                    입력 삭제
                
            
            
                
                    
                    아이디저장
                
            
            
            
            
            
            
            
            
            
            
                관리자 로그인
            
            
                *본 사이트는 크롬(Chrome) 브라우저에 최적화 되어있습니다.*
                크롬다운받기
            
        
    
    
        비밀번호 초기화
        아이디 찾기
    
    
        Copyright (C) ORP Institute. All Rights reserved.
    


  
    
      
        아이디 찾기
      
      
        
          아래 이메일 주소로 문의 부탁드립니다.
          webmaster@wiselection.com 
          이메일주소 복사
        
      
      닫기
    
  
  
    $(document).ready(function() {
      //이메일 복사
      $(&quot;.btn-copy&quot;).click(function(){
        window.navigator.clipboard.writeText($(&quot;#email-copy&quot;).text());
        alert(&quot;이메일주소가 복사되었습니다.&quot;);
      });
    });
  
  
  
    const WAP_COM_0015 = new LayerPopup({target: &quot;WAP-COM-0015&quot;});
    const WAP_COM_0015_pop = {
      &quot;WAP_COM_0015&quot; : ()=>{
        WAP_COM_0015.show()
      },
    }
    if(Util.getUrlParams().popup) WAP_COM_0015_pop[Util.getUrlParams().popup]();
  
  


    $(document).ready(function(){
        if((getCookie(&quot;userLoginId&quot;) !== &quot;&quot;)){
            $(&quot;input[name=&quot; , &quot;'&quot; , &quot;userId&quot; , &quot;'&quot; , &quot;]&quot;).val(getCookie(&quot;userLoginId&quot;));
            $(&quot;#checkId&quot;).prop(&quot;checked&quot;, true);
        }
        //아이디 저장
        $(&quot;#checkId&quot;).change(function(){
            if($(&quot;#checkId&quot;).is(&quot;:checked&quot;)){  //checked true
                const userLoginId = $(&quot;input[name=&quot; , &quot;'&quot; , &quot;userId&quot; , &quot;'&quot; , &quot;]&quot;).val();
                setCookie(&quot;userLoginId&quot;, userLoginId, 30); // 30일 동안 쿠키 보관
            }else{ //checked false
                deleteCookie(&quot;userLoginId&quot;);
            }
        });
    });


/html[1]/body[1]/div[@class=&quot;login-wrap&quot;]/form[@class=&quot;form-signin&quot;]/div[@class=&quot;login-wrap__box&quot;]/div[@class=&quot;form-inner&quot;]/div[@class=&quot;input-box&quot;]/input[@class=&quot;input-txt&quot;]&quot;) or . = concat(&quot;


    
        
            
            
                
                    
                    입력 삭제
                
            
            
                
                    
                    입력 삭제
                
            
            
                
                    
                    아이디저장
                
            
            
            
            
            
            
            
            
            
            
                관리자 로그인
            
            
                *본 사이트는 크롬(Chrome) 브라우저에 최적화 되어있습니다.*
                크롬다운받기
            
        
    
    
        비밀번호 초기화
        아이디 찾기
    
    
        Copyright (C) ORP Institute. All Rights reserved.
    


  
    
      
        아이디 찾기
      
      
        
          아래 이메일 주소로 문의 부탁드립니다.
          webmaster@wiselection.com 
          이메일주소 복사
        
      
      닫기
    
  
  
    $(document).ready(function() {
      //이메일 복사
      $(&quot;.btn-copy&quot;).click(function(){
        window.navigator.clipboard.writeText($(&quot;#email-copy&quot;).text());
        alert(&quot;이메일주소가 복사되었습니다.&quot;);
      });
    });
  
  
  
    const WAP_COM_0015 = new LayerPopup({target: &quot;WAP-COM-0015&quot;});
    const WAP_COM_0015_pop = {
      &quot;WAP_COM_0015&quot; : ()=>{
        WAP_COM_0015.show()
      },
    }
    if(Util.getUrlParams().popup) WAP_COM_0015_pop[Util.getUrlParams().popup]();
  
  


    $(document).ready(function(){
        if((getCookie(&quot;userLoginId&quot;) !== &quot;&quot;)){
            $(&quot;input[name=&quot; , &quot;'&quot; , &quot;userId&quot; , &quot;'&quot; , &quot;]&quot;).val(getCookie(&quot;userLoginId&quot;));
            $(&quot;#checkId&quot;).prop(&quot;checked&quot;, true);
        }
        //아이디 저장
        $(&quot;#checkId&quot;).change(function(){
            if($(&quot;#checkId&quot;).is(&quot;:checked&quot;)){  //checked true
                const userLoginId = $(&quot;input[name=&quot; , &quot;'&quot; , &quot;userId&quot; , &quot;'&quot; , &quot;]&quot;).val();
                setCookie(&quot;userLoginId&quot;, userLoginId, 30); // 30일 동안 쿠키 보관
            }else{ //checked false
                deleteCookie(&quot;userLoginId&quot;);
            }
        });
    });


/html[1]/body[1]/div[@class=&quot;login-wrap&quot;]/form[@class=&quot;form-signin&quot;]/div[@class=&quot;login-wrap__box&quot;]/div[@class=&quot;form-inner&quot;]/div[@class=&quot;input-box&quot;]/input[@class=&quot;input-txt&quot;]&quot;))]</value>
      <webElementGuid>d23774ac-8226-4054-b05e-810df4e6d852</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
