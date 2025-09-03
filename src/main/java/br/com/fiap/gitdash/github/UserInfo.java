package br.com.fiap.gitdash.github;

public class UserInfo {
    private String login;
    private String name;
    private String avatarUrl;
    private String htmlUrl;

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAvatarUrl() { return avatarUrl; }
    public void setAvatarUrl(String avatarUrl) { this.avatarUrl = avatarUrl; }

    public String getHtmlUrl() { return htmlUrl; }
    public void setHtmlUrl(String htmlUrl) { this.htmlUrl = htmlUrl; }
}
