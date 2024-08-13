weatherapi.com api'sini kullanarak günlük  ve haftalık havadurumu raporu oluşturuldu.

# application.properties 
uygulamayı çalıştırmak için ilk olarak https://www.weatherapi.com/ a giriş yapıp apikey almalısınız. key'i aldıktan sonra 
application.properties dosyasına şu şekilde:

weather.api.key=Buraya senin apikey'in gelecek(parantez içinde, "" içinde vs olmayacak direkt olarak kopyalayın ve yapıştırın.)
weather.api.url=http://api.weatherapi.com/v1

Bu ikisi application.properties için yeterli olacaktır. 


# pom.xml
eğer maven yüklenmez ise pom.xml'e sağ tıklayıp en alttaki. add maven seçeneğini seçiniz.

# proje yapısı
projede java 22 ve spring 3.0.0 kullanıldı. java 21 için çalışmayabilir. 

# postman isteği

http://localhost:8080/api/weather  bu endpoint'e (get isteği)

{
"city": "London"
}

request de city ve hour var. isteğe hour da ekleyebilirsiniz o zaman sadece o saata ait havadurumu raporu olacaktır. Aylık havadurumunu oluşturdum ancak free planda max 7 gün geçmişe gidiyordu. o yüzden sadece hadtalık ve günlük response oluşturdum.
yukardaki gibi şekilde istek atabilirsiniz. yukardaki request'in Response'u aşşağdadır:

{
"dailyForecast": {
"location": {
"name": "London",
"region": "City of London, Greater London",
"country": "United Kingdom",
"localtime": "2024-06-16 12:21"
},
"forecast": {
"forecastday": [
{
"date": "2024-06-16",
"day": {
"daily_will_it_rain": 1,
"daily_chance_of_rain": 100,
"daily_will_it_snow": 0,
"daily_chance_of_snow": 0,
"condition": {
"text": "Patchy light drizzle",
"icon": "//cdn.weatherapi.com/weather/64x64/day/263.png",
"code": 1150
},
"uv": 4
},
"hour": [
{
"time": "2024-06-16 00:00",
"is_day": 0,
"condition": {
"text": "Patchy rain possible",
"icon": "//cdn.weatherapi.com/weather/64x64/night/176.png",
"code": 1063
}
}
]
}
]
}
},


"weeklyForecast": {
"location": {
"name": "London",
"region": "City of London, Greater London",
"country": "United Kingdom",
"localtime": "2024-06-16 12:21"
},
"forecast": {
"forecastday": [
{
"date": "2024-06-09",
"day": {
"daily_will_it_rain": 1,
"daily_chance_of_rain": 100,
"daily_will_it_snow": 0,
"daily_chance_of_snow": 0,
"condition": {
"text": "Patchy rain possible",
"icon": "//cdn.weatherapi.com/weather/64x64/day/176.png",
"code": 1063
},
"uv": 4
},
"hour": [
{
"time": "2024-06-09 00:00",
"is_day": 0,
"condition": {
"text": "Clear",
"icon": "//cdn.weatherapi.com/weather/64x64/night/113.png",
"code": 1000
}
}
]
},
{
"date": "2024-06-10",
"day": {
"daily_will_it_rain": 1,
"daily_chance_of_rain": 100,
"daily_will_it_snow": 0,
"daily_chance_of_snow": 0,
"condition": {
"text": "Light rain shower",
"icon": "//cdn.weatherapi.com/weather/64x64/day/353.png",
"code": 1240
},
"uv": 3
},
"hour": [
{
"time": "2024-06-10 00:00",
"is_day": 0,
"condition": {
"text": "Light drizzle",
"icon": "//cdn.weatherapi.com/weather/64x64/night/266.png",
"code": 1153
}
}
]
},
{
"date": "2024-06-11",
"day": {
"daily_will_it_rain": 1,
"daily_chance_of_rain": 100,
"daily_will_it_snow": 0,
"daily_chance_of_snow": 0,
"condition": {
"text": "Light rain shower",
"icon": "//cdn.weatherapi.com/weather/64x64/day/353.png",
"code": 1240
},
"uv": 4
},
"hour": [
{
"time": "2024-06-11 00:00",
"is_day": 0,
"condition": {
"text": "Partly cloudy",
"icon": "//cdn.weatherapi.com/weather/64x64/night/116.png",
"code": 1003
}
}
]
},
{
"date": "2024-06-12",
"day": {
"daily_will_it_rain": 1,
"daily_chance_of_rain": 100,
"daily_will_it_snow": 0,
"daily_chance_of_snow": 0,
"condition": {
"text": "Light rain shower",
"icon": "//cdn.weatherapi.com/weather/64x64/day/353.png",
"code": 1240
},
"uv": 4
},
"hour": [
{
"time": "2024-06-12 00:00",
"is_day": 0,
"condition": {
"text": "Overcast",
"icon": "//cdn.weatherapi.com/weather/64x64/night/122.png",
"code": 1009
}
}
]
},
{
"date": "2024-06-13",
"day": {
"daily_will_it_rain": 1,
"daily_chance_of_rain": 100,
"daily_will_it_snow": 0,
"daily_chance_of_snow": 0,
"condition": {
"text": "Light rain shower",
"icon": "//cdn.weatherapi.com/weather/64x64/day/353.png",
"code": 1240
},
"uv": 4
},
"hour": [
{
"time": "2024-06-13 00:00",
"is_day": 0,
"condition": {
"text": "Clear",
"icon": "//cdn.weatherapi.com/weather/64x64/night/113.png",
"code": 1000
}
}
]
},
{
"date": "2024-06-14",
"day": {
"daily_will_it_rain": 1,
"daily_chance_of_rain": 100,
"daily_will_it_snow": 0,
"daily_chance_of_snow": 0,
"condition": {
"text": "Light rain shower",
"icon": "//cdn.weatherapi.com/weather/64x64/day/353.png",
"code": 1240
},
"uv": 4
},
"hour": [
{
"time": "2024-06-14 00:00",
"is_day": 0,
"condition": {
"text": "Patchy rain possible",
"icon": "//cdn.weatherapi.com/weather/64x64/night/176.png",
"code": 1063
}
}
]
},
{
"date": "2024-06-15",
"day": {
"daily_will_it_rain": 1,
"daily_chance_of_rain": 100,
"daily_will_it_snow": 0,
"daily_chance_of_snow": 0,
"condition": {
"text": "Light rain shower",
"icon": "//cdn.weatherapi.com/weather/64x64/day/353.png",
"code": 1240
},
"uv": 4
},
"hour": [
{
"time": "2024-06-15 00:00",
"is_day": 0,
"condition": {
"text": "Thundery outbreaks possible",
"icon": "//cdn.weatherapi.com/weather/64x64/night/200.png",
"code": 1087
}
}
]
},
{
"date": "2024-06-16",
"day": {
"daily_will_it_rain": 1,
"daily_chance_of_rain": 100,
"daily_will_it_snow": 0,
"daily_chance_of_snow": 0,
"condition": {
"text": "Patchy light drizzle",
"icon": "//cdn.weatherapi.com/weather/64x64/day/263.png",
"code": 1150
},
"uv": 4
},
"hour": [
{
"time": "2024-06-16 00:00",
"is_day": 0,
"condition": {
"text": "Patchy rain possible",
"icon": "//cdn.weatherapi.com/weather/64x64/night/176.png",
"code": 1063
}
}
]
}
]
}
},
"monthlyForecast": null
}
