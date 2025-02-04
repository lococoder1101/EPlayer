package ir.lococoder.eplayer.eplayer.home;


import android.webkit.WebView;

import ir.lococoder.eplayer.common.LRecyclerStruct;


class RecyclerInfo extends LRecyclerStruct {


  String title;
  String description;
  String url;
  String smallPic;
  String radioPic;
  String bigPic;
  String premiumPic;
  String hugePic;
  String lrclink;
  String all_rate;
  int id;
  int position;
  int  color;
  WebView justifyView;
  public RecyclerInfo(String title, String description,String url, String smallPic, String radioPic, String bigPic, String premiumPic, String hugePic, String lrclink, int id, int color,int position,String all_rate) {
    this.cellType = RecyclerAdapter.TYPE_EPISODE;
    this.title=title;
    this.description=description;
    this.url=  url;
    this.color=  color;
    this.smallPic=  smallPic;
    this.radioPic=  radioPic;
    this.bigPic=  bigPic;
    this.premiumPic=  premiumPic;
    this.hugePic=  hugePic;
    this.lrclink=  lrclink;
    this.id=id;
    this.position=position;
    this.all_rate=all_rate;
  }
}
