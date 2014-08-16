package wildflykansai;

import javax.enterprise.context.RequestScoped;

@Service
@RequestScoped // ここを外すと　Deploy Error WELD-001408:Unsatisfied dependencies for type Service with qualifiers @Default
public class Logic {

}
