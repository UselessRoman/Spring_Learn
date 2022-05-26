import com.wjc.config.SpringConfig;
import com.wjc.domain.Account;
import com.wjc.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService=ctx.getBean(AccountService.class);

        Account account=accountService.findById(2);

        System.out.println(account);
    }
}
