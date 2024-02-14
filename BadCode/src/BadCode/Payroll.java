package BadCode;import java.util.ArrayList;import java.util.List;public class Payroll{private List<Emp> apersonwhoispaidtoworkforsomebodyapersonwhoispaidtoworkforsomebodyapersonwhoispaidtoworkforsomebody;public Payroll() {this.apersonwhoispaidtoworkforsomebodyapersonwhoispaidtoworkforsomebodyapersonwhoispaidtoworkforsomebody = new ArrayList<>();}public void addEmp(Emp employee) {apersonwhoispaidtoworkforsomebodyapersonwhoispaidtoworkforsomebodyapersonwhoispaidtoworkforsomebody.add(employee);}public double[] calculate() {double[] payments = new double[apersonwhoispaidtoworkforsomebodyapersonwhoispaidtoworkforsomebodyapersonwhoispaidtoworkforsomebody.size()];for (int i = 0; i < apersonwhoispaidtoworkforsomebodyapersonwhoispaidtoworkforsomebodyapersonwhoispaidtoworkforsomebody.size(); i++) {payments[i] = apersonwhoispaidtoworkforsomebodyapersonwhoispaidtoworkforsomebodyapersonwhoispaidtoworkforsomebody.get(i).calculatePay();}return payments;}}

/*           ,''',
.' ., .',                                  ../'''',
.'. %%, %.',                            .,/' .,%   :
.'.% %%%,`%%%'.    .....,,,,,,.....   .,%%% .,%%'. .'
: %%% %%%%%%',:%%>>%>' .,>>%>>%>%>>%%>,.   `%%%',% :
: %%%%%%%'.,>>>%'   .,%>%>%'.,>%>%' . `%>>>,. `%%%:'
` %%%%'.,>>%'  .,%>>%>%' .,%>%>%' .>>%,. `%%>>,. `%
`%'.,>>>%'.,%%%%%%%' .,%%>%%>%' >>%%>%>>%.`%% %% `,
,`%% %%>>>%%%>>%%>%%>>%>>%>%%%  %%>%%>%%>>%>%%%' % %,
,%>%'.>>%>%'%>>%%>%%%%>%'                 `%>%>>%%.`%>>%.
,%%>' .>%>%'.%>%>>%%%>>%' ,%%>>%%>%>>%>>%>%%,.`%%%>%%. `%>%.
` ,%' .>%%%'.%>%>>%' .,%%%%%%%%'          `%%%%%%.`%%>%% .%%>
.%>% .%%>' :%>>%%'.,%%%%%%%%%'.%%%%%' `%%%%.`%%%%%.%%%%> %%>%.
,%>%' >>%%  >%' `%%%%'     `%%%%%%%'.,>,. `%%%%'     `%%%>>%%>%
.%%>%' .%%>'  %>>%, %% oO ~ Oo %%%>>'.>>>>>>. `% oO ~ Oo'.%%%'%>%,
%>'%> .%>%>%  %%>%%%'  `OoooO'.%%>>'.>>>%>>%>>.`%`OoooO'.%%>% '%>%
%',%' %>%>%'  %>%>%>% .%,>,>,   `>'.>>%>%%>>>%>.`%,>,>' %%%%> .>%>,
` %>% `%>>%%. `%%% %' >%%%%%%>,  ' >>%>>%%%>%>>> >>%%' ,%%>%'.%%>>%.
.%%'  %%%%>%.   `>%%. %>%%>>>%.>> >>>%>%%%%>%>>.>>>'.>%>%>' %>>%>%%
`.%%  `%>>%%>    %%>%  %>>>%%%>>'.>%>>>>%%%>>%>>.>',%>>%'  ,>%'>% '
%>'  %%%%%%'    `%%'  %%%%%> >' >>>>%>>%%>>%>>%> %%>%>' .%>%% .%%
%>%>, %>%%>>%%,  %>%>% `%%  %>>  >>>%>>>%%>>>>%>>  %%>>,%>%%'.%>%,
%>%>%%, `%>%%>%>%, %>%%> ,%>%>>>.>>`.,.  `"   ..'>.%. % %>%>%'.%>%%;
%'`%%>%  %%>%%  %>% %'.>%>>%>%%>>%::.  `,   /' ,%>>>%>. >%>%'.%>%'%'
` .%>%'  >%%% %>%%'.>%>%;''.,>>%%>%%::.  ..'.,%>>%>%>,`%  %'.>%%' '
%>%>%% `%>  >%%'.%%>%>>%>%>%>>>%>%>>%,,::,%>>%%>%>>%>%% `>>%>'
%'`%%>%>>%  %>'.%>>%>%>>;'' ..,,%>%>%%/::%>%%>>%%,,.``% .%>%%
`    `%>%>>%%' %>%%>>%>>%>%>%>%%>%/'       `%>%%>%>>%%% ' .%'
%'  `%>% `%>%%;'' .,>>%>%/',;;;;;,;;;;,`%>%>%,`%'   '
`    `  ` `%>%%%>%%>%%;/ @a;;;;;;;;;;;a@  >%>%%'
          `/////////';, `@a@@a@@a@@aa@',;`//'
             `//////.;;,,............,,;;//'
                 `////;;;;;;;;;;;;;;;;;/'
                    `/////////////////' */