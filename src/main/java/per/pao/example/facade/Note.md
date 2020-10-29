# Facade Pattern

## Note
>
>  又稱：表象模式、門面模式  
>  將複雜的事情變的簡單，提供次系統一個簡化的介面
>
>  極少化守則 ( Law of Demeter )： 減少依賴的類別數量
  
 ＊ 依賴性高
```
    public float getTemp(){
        Thermometer thermometer = station.getThermometer();
        return thermometer.getTemperature();
    }
```
 ＊ 極少化守則
```
    public float getTemp(){
        return station.getTemperature();
    }
```
## Reference