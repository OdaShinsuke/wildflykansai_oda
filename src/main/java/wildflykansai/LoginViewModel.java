package wildflykansai;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@Model
@RequestScoped
public class LoginViewModel implements Serializable {
  private static final long serialVersionUID = 1L;
  @Inject Logic service;

  private String loginAccount;
  private String password;
  public String getLoginAccount() {
    return loginAccount;
  }
  public void setLoginAccount(String loginAccount) {
    this.loginAccount = loginAccount;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public String login() {
    System.out.println(service);
    System.out.println(this);
    return null;
  }

  @Override
  public String toString() {
    return "loginAccount:" + loginAccount + " password:" + password;
  }
}
