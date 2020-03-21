public static void main(String[] args)     {

        WebDriver fb = new FirefoxDriver();     

        fb.get("https://www.facebook.com/");   
        fb.findElement(By.xpath("id('u_0_1')")).sendKeys("deepak");
        fb.findElement(By.xpath("id('u_0_3')")).sendKeys("kumar");
        fb.findElement(By.xpath("id('u_0_6')")).sendKeys("7869084527");
        fb.findElement(By.xpath("id('u_0_9')")).sendKeys("7869084527");
        fb.findElement(By.xpath("id('u_0_b')")).sendKeys("cs083595");
        Select date = new Select(fb.findElement(By.xpath("id('day')")));
        date.selectByVisibleText("24");
        Select month = new Select(fb.findElement(By.xpath("id('month')")));
        month.selectByVisibleText("Dec");
        Select year = new Select(fb.findElement(By.xpath("id('year')")));
        year.selectByVisibleText("1989");
        fb.findElement(By.className("_58mt")).click(); //this code is working for female
        //fb.findElement(By.className("_5k")).click(); //this code is not working for male
        fb.findElement(By.name("Create an account")).submit();
    }

}