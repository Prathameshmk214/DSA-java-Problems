SELECT 
tweet_id 
FROM 
  Tweets
 WHERE LENGTH(REPLACE(content, ' ', '')) > 15;
