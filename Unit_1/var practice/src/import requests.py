import requests

text = 'Damn it!'
api_url = 'https://api.api-ninjas.com/v1/profanityfilter?text={}'.format(text)
response = requests.get(api_url, headers={'X-Api-Key': '59+oZBKD7y5GRDQ3myNLlQ==2CENuRNFYWM9Jwze'})
if response.status_code == requests.codes.ok:
    print(response.text)
else:
    print("Error:", response.status_code, response.text)