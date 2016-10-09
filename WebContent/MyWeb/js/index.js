jQuery(document).ready(function($) {

      initBlog();
      initPortfolio();
});   


/*初始化作品集时候的循环控制*/
function initPortfolio(){

   createPortfolio();
}

/*初始化作品集并添加到界面上*/
function createPortfolio(){

      /*alert("begin");*/

      var projectName = "AAAAA";

      var projectImage = "images/portfolio/1.jpg";

      var projectType = "logo";

      var projectSrc = "#";

      var projectDec = "我是一个大帅锅"+"&nbsp;&nbsp;&nbsp;&nbsp;项目链接：<a href=\'"+projectSrc+"\' traget='_blank'>ViolentStone</a>";

      var PortfolioMsg ="<!-- .portfolio -->"+
                        "      <div class=\"portfolio "+projectType+"\" data-cat=\""+projectType+"\">  "+
                        "           <!-- .portfolio-wrapper -->"+
                        "                 <div class=\"portfolio-wrapper\">    "+
                        "                      <a href=\""+projectImage+"\" rel=\"portfolio\" title=\""+projectDec+"\">"+
                        "                          <img src=\""+projectImage+"\" alt=\"Visual Infography\" />"+
                        "                                <div class=\"label\">"+
                        "                                     <div class=\"label-text\">"+
                        "                                          <a class=\"text-title\">"+projectName+"</a>"+
                        "                                          <span class=\"text-category\">"+projectType+"</span>"+
                        "                                     </div>"+
                        "                                     <div class=\"label-bg\"></div>"+
                        "                                </div>"+
                        "                       </a>"+
                        "                </div>"+
                        "           <!-- /.portfolio-wrapper -->"+
                        "      </div>   "+
                        "<!-- /.portfolio -->";

      $("#portfoliolist").append(PortfolioMsg);

      /*alert("end");*/
}                                      

/*初始化博客时候的循环控制*/
function initBlog(){

      createBlog(); 

}                      
 

/*初始化博客并将其添加到博客走廊中*/                           
function createBlog(){



        //前一页
        var preBlogId = "post-"+3;
        //后一页
        var nextBlogId = "#";
        //blog 的ID
        var blogId = "post-"+4;
        //blogDetail 的ID
        var blogDetailId = blogId + "-page";
        //博客中的图片
        var images=new Array("images/blog/blog-1.jpg","images/blog/blog-2.jpg","images/blog/blog-3.jpg");
        //评论的信息
        var commentNum = "2";
        //博客的标题
        var title = "Blog Aside post";
        //发布的日期
        var publishDate = "January 31, 2014";
        //发布的作者
        var author = " Jane Doe";
        //博客的标签
        var tag = "php, web design";
        //博客正文
        var content = "我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。我不知道。";
        
        //判断博客图标
        var iconType1 = "fa-pencil";
        var iconType2 = "fa-picture-o";

        var nowType = "";

        var nowrolling = "";

        /*alert("begin");*/
        var commentMsg = initComments();
        /*alert("end");*/


          var rolling1 ="  <div class=\"media\">"+
                        "       <div class=\"he-wrap tpl2\">"+
                        "                <img src=\""+images[0]+"\" class=\"img-hover\" alt=\"\" />"+
                        "       </div>"+
                        " </div>";



          var rolling3 ="                                 <div class=\"media\">"+
                        "                                    <div class=\"he-wrap tpl2\">"+
                        "                                        <div id=\"carousel-1\" class=\"carousel slide\" data-ride=\"carousel\">"+
                        "                                            <ol class=\"carousel-indicators\">"+
                        "                                                <li data-target=\"#carousel-1\" data-slide-to=\"0\" class=\"active\"></li>"+
                        "                                                <li data-target=\"#carousel-1\" data-slide-to=\"1\"></li>"+
                        "                                                <li data-target=\"#carousel-1\" data-slide-to=\"2\"></li>"+
                        "                                            </ol>"+
                        "                                            <div class=\"carousel-inner\">"+
                        "                                                <div class=\"item active\">"+
                        "                                                    <img src=\""+images[0]+"\" alt=\"\" />"+
                        "                                                    <div class=\"carousel-caption\">"+
                        "                                                        <h4>First Thumbnail label</h4>"+
                        "                                                        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>"+
                        "                                                    </div>"+
                        "                                                </div>"+
                        "                                                <div class=\"item\">"+
                        "                                                    <img src=\""+images[1]+"\" alt=\"\" />"+
                        "                                                    <div class=\"carousel-caption\">"+
                        "                                                        <h4>First Thumbnail label</h4>"+
                        "                                                        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>"+
                        "                                                    </div>"+
                        "                                                </div>"+
                        "                                                <div class=\"item\">"+
                        "                                                    <img src=\""+images[2]+"\" alt=\"\" />"+
                        "                                                    <div class=\"carousel-caption\">"+
                        "                                                        <h4>First Thumbnail label</h4>"+
                        "                                                        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>"+
                        "                                                    </div>"+
                        "                                                </div>"+
                        "                                            </div>"+
                        "                                            <a class=\"left carousel-control\" href=\"#carousel-1\" data-slide=\"prev\">"+
                        "                                                <span class=\"glyphicon glyphicon-chevron-left\"></span>"+
                        "                                            </a>"+
                        "                                            <a class=\"right carousel-control\" href=\"#carousel-1\" data-slide=\"next\">"+
                        "                                                <span class=\"glyphicon glyphicon-chevron-right\"></span>"+
                        "                                            </a>"+
                        "                                        </div>"+
                        "                                    </div>"+
                        "                                </div>";


           
        if(images.length == 0){

            nowType = iconType1;
        
        }else if(images.length == 1){

            nowType = iconType2;
            nowrolling = rolling1;

        }else if(images.length == 3){
            
            nowType = iconType2;
            nowrolling = rolling3;

        }

        var blog = "<div class=\"clear\"></div>"+
                      "<article id=\""+blogId+"\" class=\"blog-article\">                    "+
                      "                    <div class=\"col-md-12\">"+
                      "                        <div class=\"row\">"+
                      "                            <div class=\"col-md-12 post_media\">"+
                      "                                <div class=\"post-format-icon\">"+
                      "                                    <a href=\"#\" class=\"item-date\"><span class=\"fa "+nowType+"\"></span></a>"+
                      "                                </div>"+
                      "                                "+nowrolling+
                      "                            </div>"+
                      "                        </div>"+
                      "                        <div class=\"row\">"+
                      "                            <div class=\"col-md-12 post_content\">"+
                      "                                <div class=\"content post_format_standart\">"+
                      "                                    <div class=\"top_c \">"+
                      "                                        <div class=\"title_content\">"+
                      "                                            <div class=\"text_content\"><a href=\"#post-4\" class=\"read_more\">"+title+"</a></div>"+
                      "                                            <div class=\"clear\"></div>"+
                      "                                        </div>"+
                      "                                        <ul class=\"info\">"+
                      "                                            <li><i class=\"glyphicon glyphicon-comment\"></i>"+commentNum+"Comments</li>"+
                      "                                            <li><i class=\"glyphicon glyphicon-time\"></i> "+publishDate+"</li>"+
                      "                                            <li><i class=\"glyphicon glyphicon-user\"></i> by"+author+"</li>"+
                      "                                            <li><i class=\"glyphicon glyphicon-tag\"></i> "+tag+"</li>"+
                      "                                        </ul>"+
                      "                                        <div class=\"blog-content\">"+
                      "                                            <p><i class=\"fa fa-quote-left\"></i>"+content+"</p></div>"+
                      "                                    </div>"+
                      "                                </div> "+
                      "                                <a href=\"#"+blogId+"\" class=\"read_m pull-right\">Read More <i class=\'glyphicon glyphicon-chevron-right\'></i></a>"+
                      "                            </div>"+
                      "                        </div>"+
                      "                    </div>"+
                      "                </article>";


         
         var blogDetail =
                            "            <section id=\""+blogDetailId+"\" class=\"content-post\" style=\"display: none\">"+
                            "                <div class=\"row inner\">"+
                            "                    <div class=\"col-md-12\" style=\"width: 100%;-webkit-box-sizing: border-box;-moz-box-sizing: border-box;box-sizing: border-box;float: left;background: rgba(255, 255, 255, 0.8);padding-bottom: 15px;padding-top: 15px;\">"+
                            "                        <article class=\"postPage\">"+
                            "                            <div class=\"col-md-12 post_media\">"+
                            "                                <div class=\"post-format-icon\">"+
                            "                                    <a href=\"#\" class=\"item-date\"><span class=\"fa "+nowType+"\"></span></a>"+
                            "                                </div>"+nowrolling+
                            "                            </div>"+
                            "                            <div class=\"title_content\">"+
                            "                                <div class=\"text_content\">"+title+"</div>"+
                            "                                <div class=\"clear\"></div>"+
                            "                            </div>"+
                            "                             <p >答："+content+"</P>"+
                            "                             <a href=\"#\">&nbsp;&nbsp;&nbsp;&nbsp;附件：ViolentStone的私人笔记</a>"+
                            "                            <div class=\"col-md-12 first\">"+
                            "                                <div class=\"info\">"+
                            "                                    <ul class=\"info-post\">"+
                            "                                        <li><i class=\"glyphicon glyphicon-comment\"></i>"+commentNum+"Comments</li>"+
                            "                                        <li><i class=\"glyphicon glyphicon-time\"></i>"+publishDate+"</li>"+
                            "                                        <li><i class=\"glyphicon glyphicon-user\"></i>"+author+"</li>"+
                            "                                        <li><i class=\"glyphicon glyphicon-tag\"></i>"+tag+"</li>"+
                            "                                    </ul>"+
                            "                                </div>"+
                            "                                <div class=\"clear\"></div>      "+
                            "                                <div class=\"about_author\">"+
                            "                                    <div class=\"title_content\" style=\"margin-bottom:10px\">"+
                            "                                        <div class=\"text_content\">ViolentStone</div>"+
                            "                                        <div class=\"clear\"></div>"+
                            "                                    </div>"+
                            "                                    <div class=\"clear\"></div>"+
                            "                                    <div class=\"prg_content\">"+
                            "                                        <img src=\"http://placehold.it/100x100\" width=\"100\" height=\"100\" alt=\"img\">"+
                            "                                        <div class=\"text\">"+
                            "                                           ViolentStone , java & 服务器端开发工程师 , 14年走上了Java Web这条不归路 。 在路上失去了很多 ，也收获了很多。"+
                            "                                           不过从没后悔过当年的决定 , 并且准备一直走下去 。 相信自己能够走得更远 。 "+
                            "                                        </div>"+
                            "                                        <div class=\"nb_post\" style=\"margin-top: 10px;\">"+
                            "                                            <b id=\"nb_post\">"+ commentNum +" Blog</b> created by author"+
                            "                                        </div>"+
                            "                                    </div>"+
                            "                                    <div class=\"clear\"></div>"+
                            "                                </div>"+
                            "                                <div class=\"clear\"></div>      "+
                            "                                <div class=\"post_comments\">"+
                            "                                    <div class=\"title_content\">"+
                            "                                        <div class=\"text_content\">" + commentNum + "Comments</div>"+
                            "                                        <div class=\"clear\"></div>"+
                            "                                    </div>"+
                            "                                    <div class=\"clear\"></div>"+commentMsg+                                 
                            "                                    <div class=\"comment_form\">"+
                            "                                        <div class=\"title_content\">"+
                            "                                            <div class=\"text_content\">你的评论</div>"+
                            "                                            <div class=\"clear\"></div>"+
                            "                                        </div>"+
                            "                                        <form method=\"post\" id=\"comment_form\">"+
                            "                                            <p class=\"form-group\" id=\"contact-name\">"+
                            "                                                <label for=\"name\">Your Name</label>"+
                            "                                                <input type=\"text\" name=\"name\" class=\"form-control\" id=\"inputSuccess\" placeholder=\"Name*...\">"+
                            "                                            </p>"+
                            "                                            <p class=\"form-group\" id=\"contact-email\"> "+
                            "                                                <label for=\"email\">Your Email</label>"+
                            "                                                <input type=\"text\" name=\"email\" class=\"form-control\" id=\"inputSuccess\" placeholder=\"Email*...\">"+
                            "                                            </p>"+
                            "                                            <p class=\"form-group\" id=\"contact-message\">"+
                            "                                                <label for=\"message\">Your Message</label>"+
                            "                                                <textarea name=\"message\" cols=\"88\" rows=\"6\" class=\"form-control\" id=\"inputError\" placeholder=\"Your Comment...\"></textarea>"+
                            "                                            </p>"+
                            "                                            <input type=\"reset\" name=\"reset\" value=\"CLEAR\" class=\"reset\">"+
                            "                                            <!--<input type=\"submit\" name=\"submit\" value=\"Post Comment\" class=\"submit\">-->"+
                            "                                            <button class=\"submit\" data-toggle=\"modal\" data-target=\".bs-example-modal-sm\">Post Comment</button>"+
                            "                                        </form>                        "+
                            "                                        <div class=\"clear\"></div>"+
                            "                                    </div>"+
                            "                                </div>"+
                            "                                <div class=\"col-md-12\" style=\"margin-top: 20px;\">"+
                            "                                    <a href=\"#"+nextBlogId+"\" class=\"readmore disabled\" id=\"pagination\"><i class=\"glyphicon glyphicon-chevron-right\"></i></a>"+
                            "                                    <a href=\"#"+preBlogId+"\" class=\"readmore\" id=\"pagination\"><i class=\"glyphicon glyphicon-chevron-left\"></i></a>"+
                            "                                    <a href=\"#blog\" id=\"blog\" class=\"readmore\"><i class=\"glyphicon glyphicon-chevron-left\"></i> All Blog</a>"+
                            "                                </div>"+
                            "                                <div class=\"clear\"></div>"+
                            "                        </article>"+
                            "                    </div>"+
                            "                    <div class=\"clear\"></div>"+
                            "                </div>"+
                            "            </section>";


         $("#blog-page").append(blog);

         
         $("#blog_page").append(blogDetail);

}

/*初始化评论是的循环控制*/
function initComments(){
   
   var comment = "";
   
   comment = createComments();

   return comment;
}

/*评论语句的填充与初始化*/
function createComments(){

    var questioner = "John Doe";

    var questionDate = "12, September, 2013";

    var questionContent = " 我不知道问些什么？";

   /* var answer = "Bill Gates";

    var answerDate ="12, September, 2013";

    var answerContent = " 那我咋回答你，擦？神经病吧你";*/

    var answer = "";

    var answerDate = "";

    var answerContent = "";

    var answerMsg ="";

    if(isEmpty(answer)&&isEmpty(answerDate)&&isEmpty(answerContent)){

        answerMsg =   "                                     <div class=\"comment sub\">"+
                      "                                                <img src=\"http://placehold.it/100x100\" width=\"100\" height=\"100\" alt=\"img\" />"+
                      "                                                <div class=\"text\">"+
                      "                                                    <div class=\"name\">"+answer+"<a class=\"reply\" href=\"#\">Reply</a></div>"+
                      "                                                    <div class=\"date\">"+answerDate+"</div>"+
                      "                                                    "+answerContent+
                      "                                                </div>"+
                      "                                                <div class=\"clear\"></div>"+
                      "                                            </div>";
    }


   

    var commentMsg =  "                                    <div class=\"comments\">"+
                      "                                        <div class=\"comment\">"+
                      "                                            <img src=\"http://placehold.it/100x100\" width=\"100\" height=\"100\" alt=\"img\" />"+
                      "                                            <div class=\"text\">"+
                      "                                                <div class=\"name\">"+questioner+"<a class=\"reply\" href=\"#\">Reply</a></div>"+
                      "                                                <div class=\"date\">"+questionDate+"</div>"+
                      "                                                 "+questionContent+
                      "                                            </div>"+answerMsg+
                      "                                            <div class=\"clear\"></div>"+
                      "                                        </div><!-- .comments -->"+
                      "                                    </div><!-- .post_comments -->"+
                      "                                    <div class=\"clear\"></div>  ";

    /*alert(commentMsg);*/

    return commentMsg;

}     
                                           
                                            
/*判断字符串是否不为空，不为空这返回true.*/                                        
function isEmpty(variable){

   if (variable !== null || variable !== undefined || variable !== '') {
       return false;
   }else{
       return true;
   }
}
                                        
                                            
                                            
                                            
                                            
                                        

                                        
                                            
                                    
                                


                            
                        

                    
                
